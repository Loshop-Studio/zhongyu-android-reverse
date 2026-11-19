.class final Lcoil3/decode/BitmapFactoryDecoder$decode$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/decode/BitmapFactoryDecoder;->a(Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "coil3.decode.BitmapFactoryDecoder"
    f = "BitmapFactoryDecoder.kt"
    l = {
        0xd4,
        0x28
    }
    m = "decode"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lcoil3/decode/BitmapFactoryDecoder;

.field public h:I


# direct methods
.method public constructor <init>(Lcoil3/decode/BitmapFactoryDecoder;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->g:Lcoil3/decode/BitmapFactoryDecoder;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->f:Ljava/lang/Object;

    iget p1, p0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->h:I

    iget-object p1, p0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->g:Lcoil3/decode/BitmapFactoryDecoder;

    invoke-virtual {p1, p0}, Lcoil3/decode/BitmapFactoryDecoder;->a(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
