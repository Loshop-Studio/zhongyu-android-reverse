.class public final synthetic Lkb/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic c:Lhd/a;


# direct methods
.method public synthetic constructor <init>(Lhd/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb/s1;->c:Lhd/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkb/s1;->c:Lhd/a;

    invoke-static {v0, p1, p2}, Lkb/w1;->e(Lhd/a;Landroid/content/DialogInterface;I)V

    return-void
.end method
