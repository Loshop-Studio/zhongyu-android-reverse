.class public final synthetic Landroidx/camera/extensions/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/extensions/VendorExtenderFactory;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createVendorExtender(I)Landroidx/camera/extensions/internal/VendorExtender;
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/camera/extensions/ExtensionsInfo;->b(I)Landroidx/camera/extensions/internal/VendorExtender;

    move-result-object p1

    return-object p1
.end method
