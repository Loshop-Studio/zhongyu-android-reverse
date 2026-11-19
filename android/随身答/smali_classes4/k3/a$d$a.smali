.class public Lk3/a$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk3/a$d;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lk3/a$d;


# direct methods
.method public constructor <init>(Lk3/a$d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk3/a$d$a;->b:Lk3/a$d;

    .line 2
    .line 3
    iput p2, p0, Lk3/a$d$a;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lk3/a$d$a;->b:Lk3/a$d;

    .line 2
    .line 3
    iget-object p1, p1, Lk3/a$d;->a:Lk3/a;

    .line 4
    .line 5
    invoke-static {p1}, Lk3/a;->g(Lk3/a;)Lk3/a$e;

    .line 6
    .line 7
    .line 8
    return-void
.end method
