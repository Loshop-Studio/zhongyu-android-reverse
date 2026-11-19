.class public final La/k/b/l0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/k/b/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:La/k/b/m;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:La/m/d$b;

.field public h:La/m/d$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILa/k/b/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/k/b/l0$a;->a:I

    iput-object p2, p0, La/k/b/l0$a;->b:La/k/b/m;

    sget-object p1, La/m/d$b;->f:La/m/d$b;

    iput-object p1, p0, La/k/b/l0$a;->g:La/m/d$b;

    iput-object p1, p0, La/k/b/l0$a;->h:La/m/d$b;

    return-void
.end method

.method public constructor <init>(ILa/k/b/m;La/m/d$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/k/b/l0$a;->a:I

    iput-object p2, p0, La/k/b/l0$a;->b:La/k/b/m;

    iget-object p1, p2, La/k/b/m;->O:La/m/d$b;

    iput-object p1, p0, La/k/b/l0$a;->g:La/m/d$b;

    iput-object p3, p0, La/k/b/l0$a;->h:La/m/d$b;

    return-void
.end method
