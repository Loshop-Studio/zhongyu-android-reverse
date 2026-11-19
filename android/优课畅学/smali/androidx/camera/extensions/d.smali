.class public final synthetic Landroidx/camera/extensions/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;


# instance fields
.field public final synthetic a:Landroidx/camera/extensions/internal/ClientVersion;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Landroidx/camera/core/CameraProvider;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/extensions/internal/ClientVersion;Landroid/content/Context;Landroidx/camera/core/CameraProvider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/extensions/d;->a:Landroidx/camera/extensions/internal/ClientVersion;

    iput-object p2, p0, Landroidx/camera/extensions/d;->b:Landroid/content/Context;

    iput-object p3, p0, Landroidx/camera/extensions/d;->c:Landroidx/camera/core/CameraProvider;

    return-void
.end method


# virtual methods
.method public final attachCompleter(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/extensions/d;->a:Landroidx/camera/extensions/internal/ClientVersion;

    iget-object v1, p0, Landroidx/camera/extensions/d;->b:Landroid/content/Context;

    iget-object v2, p0, Landroidx/camera/extensions/d;->c:Landroidx/camera/core/CameraProvider;

    invoke-static {v0, v1, v2, p1}, Landroidx/camera/extensions/ExtensionsManager;->a(Landroidx/camera/extensions/internal/ClientVersion;Landroid/content/Context;Landroidx/camera/core/CameraProvider;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
