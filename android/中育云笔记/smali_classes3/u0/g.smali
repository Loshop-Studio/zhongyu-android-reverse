.class public abstract Lu0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh0/d;

.field public static final b:Lh0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat"

    .line 2
    .line 3
    sget-object v1, Lcom/bumptech/glide/load/DecodeFormat;->e:Lcom/bumptech/glide/load/DecodeFormat;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lh0/d;->f(Ljava/lang/String;Ljava/lang/Object;)Lh0/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lu0/g;->a:Lh0/d;

    .line 10
    .line 11
    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation"

    .line 12
    .line 13
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lh0/d;->f(Ljava/lang/String;Ljava/lang/Object;)Lh0/d;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lu0/g;->b:Lh0/d;

    .line 20
    .line 21
    return-void
.end method
