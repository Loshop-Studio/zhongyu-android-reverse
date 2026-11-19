.class public final synthetic Ll2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lhd/a;


# direct methods
.method public synthetic constructor <init>(Lhd/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/l;->c:Lhd/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ll2/l;->c:Lhd/a;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/friday/common/widget/dialog/a;->d(Lhd/a;Landroid/content/Context;)Landroid/app/Dialog;

    move-result-object p1

    return-object p1
.end method
