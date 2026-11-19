.class public final Lcom/zykj/study/ui/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/ui/a;
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
    invoke-direct {p0}, Lcom/zykj/study/ui/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    sget-object v0, Lm4/k;->a:Lm4/k$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm4/k$b;->a()Landroidx/navigation/NavDirections;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
