.class public final synthetic Lgb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:[Ljava/lang/Long;

.field public final synthetic d:Lhd/l;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/Long;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/a;->c:[Ljava/lang/Long;

    iput-object p2, p0, Lgb/a;->d:Lhd/l;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgb/a;->c:[Ljava/lang/Long;

    iget-object v1, p0, Lgb/a;->d:Lhd/l;

    invoke-static {v0, v1, p1}, Lgb/b;->a([Ljava/lang/Long;Lhd/l;Landroid/view/View;)V

    return-void
.end method
