.class public abstract Lm0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly/e;

.field public static final b:Ly/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat"

    .line 2
    .line 3
    sget-object v1, Lcom/bumptech/glide/load/DecodeFormat;->DEFAULT:Lcom/bumptech/glide/load/DecodeFormat;

    .line 4
    .line 5
    invoke-static {v1, v0}, Ly/e;->a(Ljava/lang/Object;Ljava/lang/String;)Ly/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lm0/f;->a:Ly/e;

    .line 10
    .line 11
    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation"

    .line 12
    .line 13
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-static {v1, v0}, Ly/e;->a(Ljava/lang/Object;Ljava/lang/String;)Ly/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lm0/f;->b:Ly/e;

    .line 20
    .line 21
    return-void
.end method
