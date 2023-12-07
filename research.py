import requests
from bs4 import BeautifulSoup
import gensim

# Define keywords and additional search criteria
keywords = ["blockchain", "scalability", "throughput", "transaction speed"]
publication_years = [2022, 2023]  # Filter by recent publications

# Function to extract text from a URL
def extract_text(url):
    response = requests.get(url)
    soup = BeautifulSoup(response.content, "lxml")
    text = soup.get_text(strip=True)
    return text

# Function to calculate similarity score between two texts
def calculate_similarity(text1, text2):
    # Preprocess text
    text1 = text1.lower().replace("\n", " ")
    text2 = text2.lower().replace("\n", " ")
    
    # Convert text to vectors
    vector1 = gensim.utils.simple_preprocess(text1)
    vector2 = gensim.utils.simple_preprocess(text2)

    # Calculate cosine similarity
    model = gensim.models.Word2Vec([vector1, vector2], min_count=1)
    similarity = model.wv.similarity(vector1, vector2)
    return similarity

# Function to build Google Scholar search URL
def build_scholar_url(keywords, publication_years):
  # Base URL for Google Scholar searches
  base_url = "https://scholar.google.com/scholar?q="

  # Combine keywords and publication year range
  query = "+".join(keywords) + "&hl=en&as_ylo=" + str(min(publication_years)) + "&as_yhi=" + str(max(publication_years))

  # Return the complete search URL
  return base_url + query

# Define the search URL
search_url = build_scholar_url(keywords, publication_years)

# List to store research paper information
research_papers = []

# Scrape research paper URLs from Google Scholar
response = requests.get(search_url)
soup = BeautifulSoup(response.content, "lxml")

# Extract research paper URLs
for result in soup.find_all("div", class_="gs_r gs_or gs_scl"):
    url = result.find("h3").find("a")["href"]
    research_papers.append(url)

# Process each research paper
if research_papers:
    for url in research_papers:
        # Extract text from the research paper
        text = extract_text(url)

        # Calculate similarity score with the keywords
        similarity_score = 0
        for keyword in keywords:
            similarity_score += calculate_similarity(text, keyword)

        # Print research paper information and similarity score
        print(f"URL: {https://scholar.google.com/}")
        print(f"Similarity score: {https://scholar.google.com/scholar?hl=en&as_sdt=0%2C5&q=blockchain&oq=bloc}")

        # Select the most relevant research paper based on the highest similarity score
        most_relevant_paper = research_papers[0]

    print(f"Most relevant research paper: {most_relevant_paper}")
else:
    print("No relevant research papers found.")
