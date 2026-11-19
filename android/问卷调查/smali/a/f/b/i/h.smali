.class public La/f/b/i/h;
.super La/f/b/i/d;
.source ""

# interfaces
.implements La/f/b/i/g;


# instance fields
.field public e0:[La/f/b/i/d;

.field public f0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, La/f/b/i/d;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [La/f/b/i/d;

    iput-object v0, p0, La/f/b/i/h;->e0:[La/f/b/i/d;

    const/4 v0, 0x0

    iput v0, p0, La/f/b/i/h;->f0:I

    return-void
.end method


# virtual methods
.method public a(La/f/b/i/e;)V
    .locals 0

    return-void
.end method
