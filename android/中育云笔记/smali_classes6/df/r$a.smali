.class public final Ldf/r$a;
.super Ldf/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final d:Ldf/e;


# direct methods
.method public constructor <init>(Ldf/b0;Lje/e$a;Ldf/h;Ldf/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ldf/r;-><init>(Ldf/b0;Lje/e$a;Ldf/h;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Ldf/r$a;->d:Ldf/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c(Ldf/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p2, p0, Ldf/r$a;->d:Ldf/e;

    .line 2
    .line 3
    invoke-interface {p2, p1}, Ldf/e;->a(Ldf/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
