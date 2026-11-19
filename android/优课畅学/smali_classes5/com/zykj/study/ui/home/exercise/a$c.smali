.class public final Lcom/zykj/study/ui/home/exercise/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/ui/home/exercise/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/a$c;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/study/ui/home/exercise/a$c;IIIIILjava/lang/Object;)Landroidx/navigation/NavDirections;
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/study/ui/home/exercise/a$c;->a(IIII)Landroidx/navigation/NavDirections;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final a(IIII)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/exercise/a$a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lcom/zykj/study/ui/home/exercise/a$a;-><init>(IIII)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final c(III)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/exercise/a$b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/study/ui/home/exercise/a$b;-><init>(III)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
