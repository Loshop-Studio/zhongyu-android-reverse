.class public Lcom/luck/picture/lib/widget/BottomNavBar$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/widget/BottomNavBar;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/widget/BottomNavBar;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/widget/BottomNavBar;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/widget/BottomNavBar$a;->a:Lcom/luck/picture/lib/widget/BottomNavBar;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/widget/BottomNavBar$a;->a:Lcom/luck/picture/lib/widget/BottomNavBar;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/luck/picture/lib/widget/BottomNavBar;->f:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    iput-boolean p2, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->T:Z

    .line 6
    .line 7
    invoke-static {p1}, Lcom/luck/picture/lib/widget/BottomNavBar;->a(Lcom/luck/picture/lib/widget/BottomNavBar;)Landroid/widget/CheckBox;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar$a;->a:Lcom/luck/picture/lib/widget/BottomNavBar;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/luck/picture/lib/widget/BottomNavBar;->f:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 14
    .line 15
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->T:Z

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/luck/picture/lib/widget/BottomNavBar$a;->a:Lcom/luck/picture/lib/widget/BottomNavBar;

    .line 21
    .line 22
    iget-object p1, p1, Lcom/luck/picture/lib/widget/BottomNavBar;->g:Lcom/luck/picture/lib/widget/BottomNavBar$b;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/luck/picture/lib/widget/BottomNavBar$b;->a()V

    .line 27
    .line 28
    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    invoke-static {}, Lu6/a;->l()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    iget-object p1, p0, Lcom/luck/picture/lib/widget/BottomNavBar$a;->a:Lcom/luck/picture/lib/widget/BottomNavBar;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/luck/picture/lib/widget/BottomNavBar;->g:Lcom/luck/picture/lib/widget/BottomNavBar$b;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/luck/picture/lib/widget/BottomNavBar$b;->c()V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method
