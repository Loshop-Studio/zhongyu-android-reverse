.class public Landroidx/work/impl/a$h;
.super Lq0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field final c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/16 v0, 0x9

    const/16 v1, 0xa

    .line 1
    invoke-direct {p0, v0, v1}, Lq0/a;-><init>(II)V

    .line 2
    iput-object p1, p0, Landroidx/work/impl/a$h;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Ls0/b;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))"

    .line 1
    invoke-interface {p1, v0}, Ls0/b;->h(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/work/impl/a$h;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lg1/f;->b(Landroid/content/Context;Ls0/b;)V

    .line 3
    iget-object v0, p0, Landroidx/work/impl/a$h;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lg1/c;->a(Landroid/content/Context;Ls0/b;)V

    return-void
.end method
