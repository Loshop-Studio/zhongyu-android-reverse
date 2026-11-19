.class public final synthetic Ll2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/k;->c:Ljava/lang/String;

    iput-object p2, p0, Ll2/k;->d:Ljava/lang/String;

    iput-object p3, p0, Ll2/k;->e:Lhd/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ll2/k;->c:Ljava/lang/String;

    iget-object v1, p0, Ll2/k;->d:Ljava/lang/String;

    iget-object v2, p0, Ll2/k;->e:Lhd/l;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, v2, p1}, Lcom/friday/common/widget/dialog/a;->e(Ljava/lang/String;Ljava/lang/String;Lhd/l;Landroid/content/Context;)Landroid/app/Dialog;

    move-result-object p1

    return-object p1
.end method
