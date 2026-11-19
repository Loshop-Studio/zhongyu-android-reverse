.class public final Lj3/m$a;
.super Lj3/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final d:Lj3/c;


# direct methods
.method public constructor <init>(Lj3/c0;Lr2/e$a;Lj3/i;Lj3/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lj3/m;-><init>(Lj3/c0;Lr2/e$a;Lj3/i;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lj3/m$a;->d:Lj3/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c(Lj3/b;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p2, p0, Lj3/m$a;->d:Lj3/c;

    .line 2
    .line 3
    invoke-interface {p2, p1}, Lj3/c;->a(Lj3/b;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
