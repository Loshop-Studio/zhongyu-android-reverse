.class public abstract Lr0/a;
.super Lr0/b;
.source "SourceFile"


# instance fields
.field private isExpanded:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lr0/b;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lr0/a;->isExpanded:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final isExpanded()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr0/a;->isExpanded:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setExpanded(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr0/a;->isExpanded:Z

    .line 2
    .line 3
    return-void
.end method
