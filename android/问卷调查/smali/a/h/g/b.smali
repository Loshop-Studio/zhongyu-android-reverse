.class public La/h/g/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:La/h/g/m;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(La/h/g/c;La/h/g/m;I)V
    .locals 0

    iput-object p2, p0, La/h/g/b;->b:La/h/g/m;

    iput p3, p0, La/h/g/b;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, La/h/g/b;->b:La/h/g/m;

    iget v1, p0, La/h/g/b;->c:I

    check-cast v0, La/h/d/d$a;

    .line 1
    iget-object v0, v0, La/h/d/d$a;->a:La/h/c/b/h$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, La/h/c/b/h$a;->d(I)V

    :cond_0
    return-void
.end method
