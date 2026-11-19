.class public final Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:[I

.field public g:I

.field public h:I

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/jaredrummler/android/colorpicker/R$string;->cpv_default_title:I

    .line 5
    .line 6
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->a:I

    .line 7
    .line 8
    sget v0, Lcom/jaredrummler/android/colorpicker/R$string;->cpv_presets:I

    .line 9
    .line 10
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->b:I

    .line 11
    .line 12
    sget v0, Lcom/jaredrummler/android/colorpicker/R$string;->cpv_custom:I

    .line 13
    .line 14
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->c:I

    .line 15
    .line 16
    sget v0, Lcom/jaredrummler/android/colorpicker/R$string;->cpv_select:I

    .line 17
    .line 18
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->d:I

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->e:I

    .line 22
    .line 23
    sget-object v1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->x:[I

    .line 24
    .line 25
    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->f:[I

    .line 26
    .line 27
    const/high16 v1, -0x1000000

    .line 28
    .line 29
    iput v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->g:I

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->h:I

    .line 33
    .line 34
    iput-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->i:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->j:Z

    .line 37
    .line 38
    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->k:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->l:Z

    .line 41
    .line 42
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->m:I

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public a()Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;
    .locals 4

    .line 1
    new-instance v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "id"

    .line 12
    .line 13
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->h:I

    .line 14
    .line 15
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    const-string v2, "dialogType"

    .line 19
    .line 20
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->e:I

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    const-string v2, "color"

    .line 26
    .line 27
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->g:I

    .line 28
    .line 29
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    const-string v2, "presets"

    .line 33
    .line 34
    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->f:[I

    .line 35
    .line 36
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 37
    .line 38
    .line 39
    const-string v2, "alpha"

    .line 40
    .line 41
    iget-boolean v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->i:Z

    .line 42
    .line 43
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    const-string v2, "allowCustom"

    .line 47
    .line 48
    iget-boolean v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->k:Z

    .line 49
    .line 50
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v2, "allowPresets"

    .line 54
    .line 55
    iget-boolean v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->j:Z

    .line 56
    .line 57
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    const-string v2, "dialogTitle"

    .line 61
    .line 62
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->a:I

    .line 63
    .line 64
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    const-string v2, "showColorShades"

    .line 68
    .line 69
    iget-boolean v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->l:Z

    .line 70
    .line 71
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v2, "colorShape"

    .line 75
    .line 76
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->m:I

    .line 77
    .line 78
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    const-string v2, "presetsButtonText"

    .line 82
    .line 83
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->b:I

    .line 84
    .line 85
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    const-string v2, "customButtonText"

    .line 89
    .line 90
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->c:I

    .line 91
    .line 92
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    const-string v2, "selectedButtonText"

    .line 96
    .line 97
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->d:I

    .line 98
    .line 99
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 103
    .line 104
    .line 105
    return-object v0
.end method

.method public b(Z)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->k:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public c(Z)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->j:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public d(I)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;
    .locals 0

    .line 1
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->g:I

    .line 2
    .line 3
    return-object p0
.end method

.method public e(I)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;
    .locals 0

    .line 1
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->m:I

    .line 2
    .line 3
    return-object p0
.end method

.method public f(I)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;
    .locals 0

    .line 1
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->a:I

    .line 2
    .line 3
    return-object p0
.end method

.method public g(I)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;
    .locals 0

    .line 1
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->e:I

    .line 2
    .line 3
    return-object p0
.end method

.method public h([I)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->f:[I

    .line 2
    .line 3
    return-object p0
.end method

.method public i(Z)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->i:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public j(Z)Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$k;->l:Z

    .line 2
    .line 3
    return-object p0
.end method
