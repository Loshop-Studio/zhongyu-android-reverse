.class public final Lsd/m1;
.super Lsd/p1;
.source "SourceFile"


# instance fields
.field public final g:Lhd/l;


# direct methods
.method public constructor <init>(Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lsd/p1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsd/m1;->g:Lhd/l;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public u()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsd/m1;->g:Lhd/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
