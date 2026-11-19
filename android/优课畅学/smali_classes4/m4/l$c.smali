.class public final Lm4/l$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm4/l;
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
    invoke-direct {p0}, Lm4/l$c;-><init>()V

    return-void
.end method

.method public static synthetic b(Lm4/l$c;Lcom/zykj/study/bean/exercise/ExerciseBean;IIILjava/lang/Object;)Landroidx/navigation/NavDirections;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lm4/l$c;->a(Lcom/zykj/study/bean/exercise/ExerciseBean;II)Landroidx/navigation/NavDirections;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final a(Lcom/zykj/study/bean/exercise/ExerciseBean;II)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    const-string v0, "exerciseBean"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm4/l$a;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, p3}, Lm4/l$a;-><init>(Lcom/zykj/study/bean/exercise/ExerciseBean;II)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final c(Ljava/lang/String;)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm4/l$b;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lm4/l$b;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
