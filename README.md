# AR Pong

### Overview
AR Pong emulates the classic game of Pong. This version of Pong has been made to work in augmented reality.

### Game Features 
- Theme music and sound effects
- Single Player
- Dynamic scoring
- Username creation
- Difficulty settings for AI opponent
- Custom gesture detector with gesture-based controls

### How It Works
The easiest way to get started is with Sceneform’s AR Fragment
- Renders an AR enabled camera view   
- Checks for user permissions and if Google Services for AR is installed
    
Sceneform allows us to define a scene via a tree structure

The anchor node is placed in the 3D world by the user
- Nodes can render a ModelRenderable, a Sceneform 3D object
- Nodes can have child nodes
- Nodes have an update() method, allowing for animation

ModelRenderables can be primitive 3D shapes, custom models in .sfa format, and even Android views layouts defined in XML!

### AR Core 
Google’s premier library for creating augmented reality experiences for mobile devices. Full SDK for Android, and interfaces with Apple ARKit on iOS for Google Cloud. Users scan the physical area around them and 3D objects are placed in relation to “anchors”.

Three main capabilities:
- Motion tracking
- Environmental understanding
- Light estimation
    
Compatible with Google Sceneform:
- An SDK that makes 3D graphics without needing to know OpenGL
- Uses the Google Filament rendering engine

### Dependencies
- Google ARCore
- Google Sceneform
- KotlinX Coroutines
- Glide