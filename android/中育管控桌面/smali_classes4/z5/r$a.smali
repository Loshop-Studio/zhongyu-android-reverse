.class public final Lz5/r$a;
.super Lz5/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz5/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final d:Lz5/e;


# direct methods
.method public constructor <init>(Lz5/b0;Lf5/e$a;Lz5/h;Lz5/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lz5/r;-><init>(Lz5/b0;Lf5/e$a;Lz5/h;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lz5/r$a;->d:Lz5/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c(Lz5/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p2, p0, Lz5/r$a;->d:Lz5/e;

    .line 2
    .line 3
    invoke-interface {p2, p1}, Lz5/e;->b(Lz5/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
