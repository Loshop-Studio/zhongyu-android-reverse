.class public La/t/a/b$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/t/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/t/a/b;


# direct methods
.method public constructor <init>(La/t/a/b;)V
    .locals 0

    iput-object p1, p0, La/t/a/b$c;->b:La/t/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, La/t/a/b$c;->b:La/t/a/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La/t/a/b;->setScrollState(I)V

    iget-object v0, p0, La/t/a/b$c;->b:La/t/a/b;

    .line 1
    iget v1, v0, La/t/a/b;->g:I

    invoke-virtual {v0, v1}, La/t/a/b;->s(I)V

    return-void
.end method
