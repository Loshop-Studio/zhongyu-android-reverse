.class public final synthetic Ll2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Z

.field public final synthetic d:Lhd/a;


# direct methods
.method public synthetic constructor <init>(ZLhd/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll2/o;->c:Z

    iput-object p2, p0, Ll2/o;->d:Lhd/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Ll2/o;->c:Z

    iget-object v1, p0, Ll2/o;->d:Lhd/a;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lcom/friday/common/widget/dialog/a;->n(ZLhd/a;Landroid/content/Context;)Landroid/app/Dialog;

    move-result-object p1

    return-object p1
.end method
