.class public final synthetic Ln4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lx7/l;


# direct methods
.method public synthetic constructor <init>(ZLx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ln4/m;->a:Z

    iput-object p2, p0, Ln4/m;->b:Lx7/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Ln4/m;->a:Z

    iget-object v1, p0, Ln4/m;->b:Lx7/l;

    check-cast p1, Lcom/zykj/study/bean/course/CatalogBean;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderChapter;->a(ZLx7/l;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
