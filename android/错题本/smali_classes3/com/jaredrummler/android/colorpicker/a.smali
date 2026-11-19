.class public final Lcom/jaredrummler/android/colorpicker/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:[I

.field public g:I

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:I


# virtual methods
.method public final a()Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;
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
    const/4 v3, 0x0

    .line 14
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    const-string v2, "dialogType"

    .line 18
    .line 19
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/a;->e:I

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    const-string v2, "color"

    .line 25
    .line 26
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/a;->g:I

    .line 27
    .line 28
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const-string v2, "presets"

    .line 32
    .line 33
    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/a;->f:[I

    .line 34
    .line 35
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 36
    .line 37
    .line 38
    const-string v2, "alpha"

    .line 39
    .line 40
    iget-boolean v3, p0, Lcom/jaredrummler/android/colorpicker/a;->h:Z

    .line 41
    .line 42
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 43
    .line 44
    .line 45
    const-string v2, "allowCustom"

    .line 46
    .line 47
    iget-boolean v3, p0, Lcom/jaredrummler/android/colorpicker/a;->j:Z

    .line 48
    .line 49
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    const-string v2, "allowPresets"

    .line 53
    .line 54
    iget-boolean v3, p0, Lcom/jaredrummler/android/colorpicker/a;->i:Z

    .line 55
    .line 56
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v2, "dialogTitle"

    .line 60
    .line 61
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/a;->a:I

    .line 62
    .line 63
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    const-string v2, "showColorShades"

    .line 67
    .line 68
    iget-boolean v3, p0, Lcom/jaredrummler/android/colorpicker/a;->k:Z

    .line 69
    .line 70
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v2, "colorShape"

    .line 74
    .line 75
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/a;->l:I

    .line 76
    .line 77
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    const-string v2, "presetsButtonText"

    .line 81
    .line 82
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/a;->b:I

    .line 83
    .line 84
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    const-string v2, "customButtonText"

    .line 88
    .line 89
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/a;->c:I

    .line 90
    .line 91
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 92
    .line 93
    .line 94
    const-string v2, "selectedButtonText"

    .line 95
    .line 96
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/a;->d:I

    .line 97
    .line 98
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 102
    .line 103
    .line 104
    return-object v0
.end method
