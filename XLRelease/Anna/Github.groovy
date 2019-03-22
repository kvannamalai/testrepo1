// Exported from:        http://lp-PC:5516/#/templates/Folder21658ed909ab42d09dcd49b6d1650cd0-Releasefbf0f1e62fbf4932a1fdbe2d991bf797/releasefile
// XL Release version:   8.5.4
// Date created:         Thu Mar 21 12:37:05 PDT 2019

xlr {
  template('Github') {
    folder('Anna')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2019-03-21T09:00:00-0700')
    phases {
      phase('Preparation') {
        color '#0099CC'
        tasks {
          manual('day1') {
            
          }
          manual('d') {
            
          }
          manual('day2') {
            
          }
        }
      }
      phase('Execution') {
        color '#FD8D10'
      }
      phase('Rollout') {
        color '#D94C3D'
      }
    }
    
  }
}