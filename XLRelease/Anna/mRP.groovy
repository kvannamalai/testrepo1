// Exported from:        http://lp-PC:5516/#/templates/Folder21658ed909ab42d09dcd49b6d1650cd0-Release64d4550397674a84ab7d5507f45882d5/releasefile
// XL Release version:   8.5.4
// Date created:         Thu Mar 21 13:56:47 PDT 2019

xlr {
  template('mRP') {
    folder('Anna')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2019-03-21T09:00:00-0700')
    phases {
      phase('Pre Release Tasks') {
        color '#0099CC'
      }
      phase('Release Tasks') {
        color '#08B153'
        tasks {
          manual('MM enable') {
            
          }
        }
      }
      phase('Post  Release Tasks') {
        color '#FD8D10'
        tasks {
          manual('CRQ close') {
            
          }
        }
      }
    }
    
  }
}