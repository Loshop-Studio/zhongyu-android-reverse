.class public final synthetic Le5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:[Ljava/lang/Long;

.field public final synthetic b:Lx7/l;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/Long;Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le5/b;->a:[Ljava/lang/Long;

    iput-object p2, p0, Le5/b;->b:Lx7/l;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le5/b;->a:[Ljava/lang/Long;

    iget-object v1, p0, Le5/b;->b:Lx7/l;

    invoke-static {v0, v1, p1}, Le5/c;->a([Ljava/lang/Long;Lx7/l;Landroid/view/View;)V

    return-void
.end method
