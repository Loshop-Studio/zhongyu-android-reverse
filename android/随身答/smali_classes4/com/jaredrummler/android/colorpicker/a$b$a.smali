.class public Lcom/jaredrummler/android/colorpicker/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/a$b;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/jaredrummler/android/colorpicker/a$b;


# direct methods
.method public constructor <init>(Lcom/jaredrummler/android/colorpicker/a$b;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b$a;->b:Lcom/jaredrummler/android/colorpicker/a$b;

    .line 2
    .line 3
    iput p2, p0, Lcom/jaredrummler/android/colorpicker/a$b$a;->a:I

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
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b$a;->b:Lcom/jaredrummler/android/colorpicker/a$b;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/a$b;->e:Lcom/jaredrummler/android/colorpicker/a;

    .line 4
    .line 5
    iget v0, p1, Lcom/jaredrummler/android/colorpicker/a;->c:I

    .line 6
    .line 7
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/a$b$a;->a:I

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    iput v1, p1, Lcom/jaredrummler/android/colorpicker/a;->c:I

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/a$b$a;->b:Lcom/jaredrummler/android/colorpicker/a$b;

    .line 17
    .line 18
    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/a$b;->e:Lcom/jaredrummler/android/colorpicker/a;

    .line 19
    .line 20
    iget-object v0, p1, Lcom/jaredrummler/android/colorpicker/a;->a:Lcom/jaredrummler/android/colorpicker/a$a;

    .line 21
    .line 22
    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/a;->b:[I

    .line 23
    .line 24
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/a$b$a;->a:I

    .line 25
    .line 26
    aget p1, p1, v1

    .line 27
    .line 28
    invoke-interface {v0, p1}, Lcom/jaredrummler/android/colorpicker/a$a;->a(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
