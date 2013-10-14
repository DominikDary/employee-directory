### Employee Directory

Apache Cordova app for finding corporate contacts.

# CREDIT
The html part is based on the work of [
Christophe Coenraets](http://coenraets.org/blog/2013/06/sample-mobile-phonegap-application-with-backbone-js-and-topcoat/)


# Build it

Install cordova:

    sudo npm install -g cordova
    
Clone the project:

    git clone https://github.com/DominikDary/employee-directory.git
    
Build it**:

    cd employee-directory
    
Now you can find the build apk in folder: ```platforms/android/bin/```

    
**If the build is quitting with an error, please make sure Android is installed and the cordova libs are build. 
To build them again you can trigger the build via:

    cordova platform update android
