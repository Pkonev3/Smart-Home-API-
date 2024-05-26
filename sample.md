Smart Home API Documentation
Introduction
This documentation outlines the endpoints and functionalities of the Smart Home API, allowing interaction with devices and routines within a smart home system.
Device Controller
The DeviceController manages devices and provides endpoints for creating, retrieving, updating, and deleting devices.
Create Device
Route: POST /api/devices
Description: Creates a new device.
Request Body:
JSON

{
    "id": 1,
    "name": "Smart Bulb",
    "type": "Lighting",
    "status": "ON"
    // Additional device properties...
}
AI-generated code. Review and use carefully. More info on FAQ.
Response: Returns the created device.
Get Device by ID
Route: GET /api/devices/{id}
Description: Retrieves a device by its unique identifier.
Response: Returns the device details if found; otherwise, returns a 404 Not Found.
Get All Devices
Route: GET /api/devices
Description: Retrieves a list of all devices.
Response: Returns a list of devices.
Update Device
Route: PUT /api/devices/{id}
Description: Updates an existing device.
Request Body:
JSON

{
    "name": "Updated Smart Bulb",
    "status": "OFF"
    // Additional updated device properties...
}
AI-generated code. Review and use carefully. More info on FAQ.
Response: Returns the updated device if successful; otherwise, returns a 404 Not Found.
Delete Device
Route: DELETE /api/devices/{id}
Description: Deletes a device by its ID.
Response: Returns a 204 No Content if successful.
Routine Controller
The RoutineController handles routines and provides endpoints for creating, retrieving, updating, and deleting routines.
Create Routine
Route: POST /api/routines
Description: Creates a new routine.
Request Body:
JSON

{
    "id": 1,
    "name": "Morning Routine",
    "actions": ["Turn on lights", "Adjust thermostat"]
    // Additional routine properties...
}
AI-generated code. Review and use carefully. More info on FAQ.
Response: Returns the created routine.
Get Routine by ID
Route: GET /api/routines/{id}
Description: Retrieves a routine by its unique identifier.
Response: Returns the routine details if found; otherwise, returns a 404 Not Found.
Get All Routines
Route: GET /api/routines
Description: Retrieves a list of all routines.
Response: Returns a list of routines.
Update Routine
Route: PUT /api/routines/{id}
Description: Updates an existing routine.
Request Body:
JSON

{
    "name": "Updated Morning Routine",
    "actions": ["Turn on lights", "Adjust thermostat", "Play music"]
    // Additional updated routine properties...
}
AI-generated code. Review and use carefully. More info on FAQ.
Response: Returns the updated routine if successful; otherwise, returns a 404 Not Found.
Delete Routine
Route: DELETE /api/routines/{id}
Description: Deletes a routine by its ID.
Response: Returns a 204 No Content if successful.
Conclusion
This API documentation provides an overview of available endpoints. For detailed implementation and usage instructions, refer to the actual codebase. Happy coding! 🚀
