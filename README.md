### Activity
* UI concept
* represents a single screen on your
* Just like the naming: it helps the user do something - viewing data, creating data, editing data etc.
* Depends on the Activity Lifecycle
* Applications usually consist of several Activities

### View
* UI element
* Button, Textfield, etc.
* everything you see on a screen is a View

### Intent
* An "intention" to do some work:
> Broadcast a message
> Start a Service
> Launch an Activity
> Display a web page or a list of contacts
> dial a phone nr. or answer a call
> etc.
* Intents are also used by the system to notify your application of specific events
* Can be explicit or implicit

### Content Provider
* Standard mechanism to share data between applications without exposing underlying storage, structure and implementation
* RESTful approach: 
content://com.example.transportationprovider/trains/122

### Service
* Background processes that can run for a long time
* Music player, E-mail syncer etc.

### AndroidManifest.xml
* defines the content and behaviour of your application
* e.g. lists Activities, Services, permissions etc.