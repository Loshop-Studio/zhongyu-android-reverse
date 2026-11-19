.class public final Lcom/zykj/study/ui/home/exercise/train/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/ui/home/exercise/train/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
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
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/train/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    sget-object v0, Lm4/j;->a:Lm4/j$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm4/j$c;->a()Landroidx/navigation/NavDirections;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final b(Ljava/lang/String;)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lm4/j;->a:Lm4/j$c;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lm4/j$c;->c(Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
