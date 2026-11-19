.class public abstract Ln1/a;
.super Ln1/b;
.source "SourceFile"


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ln1/b;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Ln1/a;->a:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ln1/a;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ln1/a;->a:Z

    .line 2
    .line 3
    return-void
.end method
