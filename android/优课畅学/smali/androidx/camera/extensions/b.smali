.class public final synthetic Landroidx/camera/extensions/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/CameraConfigProvider;


# instance fields
.field public final synthetic a:Landroidx/camera/extensions/ExtensionsInfo;

.field public final synthetic b:I

.field public final synthetic c:Landroidx/camera/core/impl/Identifier;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/extensions/ExtensionsInfo;ILandroidx/camera/core/impl/Identifier;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/extensions/b;->a:Landroidx/camera/extensions/ExtensionsInfo;

    iput p2, p0, Landroidx/camera/extensions/b;->b:I

    iput-object p3, p0, Landroidx/camera/extensions/b;->c:Landroidx/camera/core/impl/Identifier;

    return-void
.end method


# virtual methods
.method public final getConfig(Landroidx/camera/core/CameraInfo;Landroid/content/Context;)Landroidx/camera/core/impl/CameraConfig;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/extensions/b;->a:Landroidx/camera/extensions/ExtensionsInfo;

    iget v1, p0, Landroidx/camera/extensions/b;->b:I

    iget-object v2, p0, Landroidx/camera/extensions/b;->c:Landroidx/camera/core/impl/Identifier;

    invoke-static {v0, v1, v2, p1, p2}, Landroidx/camera/extensions/ExtensionsInfo;->a(Landroidx/camera/extensions/ExtensionsInfo;ILandroidx/camera/core/impl/Identifier;Landroidx/camera/core/CameraInfo;Landroid/content/Context;)Landroidx/camera/core/impl/CameraConfig;

    move-result-object p1

    return-object p1
.end method
