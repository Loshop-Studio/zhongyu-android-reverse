.class public Lb/b/a/a/q/d$c;
.super Lb/b/a/a/q/d$h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b/a/a/q/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic d:Lb/b/a/a/q/d;


# direct methods
.method public constructor <init>(Lb/b/a/a/q/d;)V
    .locals 1

    iput-object p1, p0, Lb/b/a/a/q/d$c;->d:Lb/b/a/a/q/d;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lb/b/a/a/q/d$h;-><init>(Lb/b/a/a/q/d;Lb/b/a/a/q/b;)V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 2

    iget-object v0, p0, Lb/b/a/a/q/d$c;->d:Lb/b/a/a/q/d;

    iget v1, v0, Lb/b/a/a/q/d;->d:F

    iget v0, v0, Lb/b/a/a/q/d;->e:F

    add-float/2addr v1, v0

    return v1
.end method
