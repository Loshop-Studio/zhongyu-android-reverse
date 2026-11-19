.class public La/h/j/z$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/h/j/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:La/h/j/z;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, La/h/j/z;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/h/j/z;-><init>(La/h/j/z;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/h/j/z$d;->a:La/h/j/z;

    return-void
.end method

.method public constructor <init>(La/h/j/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/h/j/z$d;->a:La/h/j/z;

    return-void
.end method


# virtual methods
.method public a()La/h/j/z;
    .locals 0

    const p0, 0x0

    throw p0
.end method

.method public b(La/h/d/b;)V
    .locals 0

    const p0, 0x0

    throw p0
.end method

.method public c(La/h/d/b;)V
    .locals 0

    const p0, 0x0

    throw p0
.end method
