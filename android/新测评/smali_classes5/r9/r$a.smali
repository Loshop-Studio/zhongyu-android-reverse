.class public final Lr9/r$a;
.super Lr9/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr9/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final d:Lr9/e;


# direct methods
.method public constructor <init>(Lr9/b0;La9/e$a;Lr9/h;Lr9/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lr9/r;-><init>(Lr9/b0;La9/e$a;Lr9/h;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lr9/r$a;->d:Lr9/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c(Lr9/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p2, p0, Lr9/r$a;->d:Lr9/e;

    .line 2
    .line 3
    invoke-interface {p2, p1}, Lr9/e;->b(Lr9/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
