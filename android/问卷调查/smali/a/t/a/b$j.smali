.class public La/t/a/b$j;
.super Landroid/database/DataSetObserver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/t/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "j"
.end annotation


# instance fields
.field public final synthetic a:La/t/a/b;


# direct methods
.method public constructor <init>(La/t/a/b;)V
    .locals 0

    iput-object p1, p0, La/t/a/b$j;->a:La/t/a/b;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    iget-object v0, p0, La/t/a/b$j;->a:La/t/a/b;

    invoke-virtual {v0}, La/t/a/b;->f()V

    return-void
.end method

.method public onInvalidated()V
    .locals 1

    iget-object v0, p0, La/t/a/b$j;->a:La/t/a/b;

    invoke-virtual {v0}, La/t/a/b;->f()V

    return-void
.end method
