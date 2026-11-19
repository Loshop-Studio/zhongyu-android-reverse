.class public abstract Lcom/zykj/evaluation/ui/detail/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/ui/detail/e$a;,
        Lcom/zykj/evaluation/ui/detail/e$b;,
        Lcom/zykj/evaluation/ui/detail/e$c;,
        Lcom/zykj/evaluation/ui/detail/e$d;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zykj/evaluation/ui/detail/e;->a:I

    .line 4
    iput p2, p0, Lcom/zykj/evaluation/ui/detail/e;->b:I

    .line 5
    iput p3, p0, Lcom/zykj/evaluation/ui/detail/e;->c:I

    return-void
.end method

.method public synthetic constructor <init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/detail/e;-><init>(III)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/ui/detail/e;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/ui/detail/e;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/ui/detail/e;->b:I

    .line 2
    .line 3
    return v0
.end method
