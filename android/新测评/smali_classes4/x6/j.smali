.class public final Lx6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:[Ljava/lang/String;

.field public final c:[Landroid/graphics/Bitmap;

.field public final d:[Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ljava/util/List;[Ljava/lang/String;[Landroid/graphics/Bitmap;[Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    const-string v0, "questionAnswerList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "selectArray"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "blankArray"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "handArray"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lx6/j;->a:Ljava/util/List;

    .line 25
    .line 26
    iput-object p2, p0, Lx6/j;->b:[Ljava/lang/String;

    .line 27
    .line 28
    iput-object p3, p0, Lx6/j;->c:[Landroid/graphics/Bitmap;

    .line 29
    .line 30
    iput-object p4, p0, Lx6/j;->d:[Landroid/graphics/Bitmap;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()[Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lx6/j;->c:[Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()[Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lx6/j;->d:[Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lx6/j;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lx6/j;->b:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
