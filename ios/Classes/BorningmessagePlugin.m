#import "BorningmessagePlugin.h"
#import <borningmessage/borningmessage-Swift.h>

@implementation BorningmessagePlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftBorningmessagePlugin registerWithRegistrar:registrar];
}
@end
