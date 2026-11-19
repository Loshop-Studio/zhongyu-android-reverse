.class public final Lcoil3/decode/BitmapFactoryDecoder$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcoil3/decode/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil3/decode/BitmapFactoryDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lkotlinx/coroutines/sync/Semaphore;

.field public final b:Ln/n;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/sync/Semaphore;Ln/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/decode/BitmapFactoryDecoder$c;->a:Lkotlinx/coroutines/sync/Semaphore;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil3/decode/BitmapFactoryDecoder$c;->b:Ln/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lp/p;Ly/k;Lcoil3/e;)Lcoil3/decode/a;
    .locals 2

    .line 1
    new-instance p3, Lcoil3/decode/BitmapFactoryDecoder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lp/p;->b()Ln/r;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcoil3/decode/BitmapFactoryDecoder$c;->a:Lkotlinx/coroutines/sync/Semaphore;

    .line 8
    .line 9
    iget-object v1, p0, Lcoil3/decode/BitmapFactoryDecoder$c;->b:Ln/n;

    .line 10
    .line 11
    invoke-direct {p3, p1, p2, v0, v1}, Lcoil3/decode/BitmapFactoryDecoder;-><init>(Ln/r;Ly/k;Lkotlinx/coroutines/sync/Semaphore;Ln/n;)V

    .line 12
    .line 13
    .line 14
    return-object p3
.end method
