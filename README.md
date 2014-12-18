# Kaltura Audit-Trail - Viewer Example Application #

----------


## Audit-Trail ##

The object that created for each event is KalturaAuditTrail.
As you can see, it could be created as result of each one of the actions in KalturaAuditTrailAction on any of the object types in KalturaAuditTrailObjectType.

## Actions explained ##

Automatic events:

 - CHANGED	Object changed in the database
 - COPIED	Object created in the database by cloning existing object
 - CREATED	Object created in the database
 - DELETED	Object status changed to deleted (in fact this object wasn’t deleted from the database)
 - FILE_SYNC_CREATED	File saved to the disc, related to the object

Additional events that could be reported using the API, not automatic, and as such could be triggered when the customer think it’s relevant:

 - CONTENT_VIEWED
 - RELATION_ADDED
 - RELATION_REMOVED
 - VIEWED

## Usage ##
Adding and listing the events could be done by the API service:
http://www.kaltura.com/api_v3/testmeDoc/index.php?service=audit_auditTrail


----------
