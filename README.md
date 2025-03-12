# Megablunders-test

## Overview
A Java-based desktop application that combines URL link extraction and text manipulation functionality. The project demonstrates proficiency in Java Swing/AWT GUI development, network programming, and event handling.

## Key Features
- **URL Link Extractor**: 
  - Fetches and displays links from any given webpage
  - Interactive GUI for URL input and link display
  - Real-time link extraction and rendering
  
- **Text Manipulation Tool**:
  - Word tokenization and manipulation
  - Interactive button-based word replacement
  - Dynamic text processing capabilities

## Technical Challenges & Solutions

### 1. URL Processing and Link Extraction
- **Challenge**: Parsing HTML content and extracting valid URLs while handling various edge cases
- **Solution**: Implemented robust HTML parsing using Java's URL and DataInputStream classes, with custom logic to identify and extract 'href' attributes

### 2. Dynamic GUI Components
- **Challenge**: Creating a responsive interface that updates in real-time as links are extracted
- **Solution**: Utilized custom Canvas implementation (HalesCanvas) for efficient rendering and implemented MouseListener for interactive elements

### 3. Event Handling
- **Challenge**: Managing multiple event sources and maintaining application state
- **Solution**: Implemented comprehensive ActionListener and MouseListener interfaces with proper event delegation

## Technologies Used
- Java Swing/AWT for GUI components
- Java Networking (URL, DataInputStream)
- Custom Canvas implementation for rendering
- Event-driven architecture

## Setup and Usage

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Java Runtime Environment (JRE)

### Running the Application
1. Clone the repository
2. Navigate to the project directory
3. Compile the Java files:
   ```bash
   javac "URL and JFrames"/*.java
   ```
4. Run the main application:
   ```bash
   java -cp "URL and JFrames" FrameLayoutAppletURL
   ```

