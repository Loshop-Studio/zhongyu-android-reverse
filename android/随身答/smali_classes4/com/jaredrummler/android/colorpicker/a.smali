.class public Lcom/jaredrummler/android/colorpicker/a;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jaredrummler/android/colorpicker/a$b;,
        Lcom/jaredrummler/android/colorpicker/a$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/jaredrummler/android/colorpicker/a$a;

.field public final b:[I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Lcom/jaredrummler/android/colorpicker/a$a;[III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/a;->a:Lcom/jaredrummler/android/colorpicker/a$a;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/jaredrummler/android/colorpicker/a;->b:[I

    .line 7
    .line 8
    iput p3, p0, Lcom/jaredrummler/android/colorpicker/a;->c:I

    .line 9
    .line 10
    iput p4, p0, Lcom/jaredrummler/android/colorpicker/a;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/a;->c:I

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/a;->b:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/a;->b:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    new-instance p2, Lcom/jaredrummler/android/colorpicker/a$b;

    .line 4
    .line 5
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-direct {p2, p0, p3}, Lcom/jaredrummler/android/colorpicker/a$b;-><init>(Lcom/jaredrummler/android/colorpicker/a;Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iget-object p3, p2, Lcom/jaredrummler/android/colorpicker/a$b;->a:Landroid/view/View;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    check-cast p3, Lcom/jaredrummler/android/colorpicker/a$b;

    .line 20
    .line 21
    move-object v0, p3

    .line 22
    move-object p3, p2

    .line 23
    move-object p2, v0

    .line 24
    :goto_0
    invoke-virtual {p2, p1}, Lcom/jaredrummler/android/colorpicker/a$b;->c(I)V

    .line 25
    .line 26
    .line 27
    return-object p3
.end method
