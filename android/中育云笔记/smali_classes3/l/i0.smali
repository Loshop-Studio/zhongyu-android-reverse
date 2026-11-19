.class public final synthetic Ll/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Landroid/content/res/AssetFileDescriptor;


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/AssetFileDescriptor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/i0;->a:Landroid/content/res/AssetFileDescriptor;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ll/i0;->a:Landroid/content/res/AssetFileDescriptor;

    invoke-static {v0}, Ll/j0;->a(Landroid/content/res/AssetFileDescriptor;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v0

    return-object v0
.end method
