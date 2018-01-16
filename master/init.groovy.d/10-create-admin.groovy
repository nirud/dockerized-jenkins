import jenkins.model.*
import hudson.security.*
def realm = new HudsonPrivateSecurityRealm(false)
realm.createAccount('admin', 'admin')
Jenkins.instance.securityRealm = realm
Jenkins.instance.authorizationStrategy = new FullControlOnceLoggedInAuthorizationStrategy()
