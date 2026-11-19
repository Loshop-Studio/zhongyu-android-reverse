.class Lcom/lljjcoder/style/citypickerview/CityPickerView$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lljjcoder/style/citypickerview/CityPickerView;->initCityPickerPopwindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;


# direct methods
.method public constructor <init>(Lcom/lljjcoder/style/citypickerview/CityPickerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->access$300(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->access$000(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/citywheel/CityConfig;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lcom/lljjcoder/citywheel/CityConfig;->getWheelType()Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object v0, Lcom/lljjcoder/citywheel/CityConfig$WheelType;->PRO:Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 20
    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->access$200(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/Interface/OnCityItemClickListener;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->access$300(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityParseHelper;->getProvinceBean()Lcom/lljjcoder/bean/ProvinceBean;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Lcom/lljjcoder/bean/CityBean;

    .line 40
    .line 41
    invoke-direct {v1}, Lcom/lljjcoder/bean/CityBean;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v2, Lcom/lljjcoder/bean/DistrictBean;

    .line 45
    .line 46
    invoke-direct {v2}, Lcom/lljjcoder/bean/DistrictBean;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0, v1, v2}, Lcom/lljjcoder/Interface/OnCityItemClickListener;->onSelected(Lcom/lljjcoder/bean/ProvinceBean;Lcom/lljjcoder/bean/CityBean;Lcom/lljjcoder/bean/DistrictBean;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 54
    .line 55
    invoke-static {p1}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->access$000(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/citywheel/CityConfig;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Lcom/lljjcoder/citywheel/CityConfig;->getWheelType()Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object v0, Lcom/lljjcoder/citywheel/CityConfig$WheelType;->PRO_CITY:Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 64
    .line 65
    if-ne p1, v0, :cond_1

    .line 66
    .line 67
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 68
    .line 69
    invoke-static {p1}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->access$200(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/Interface/OnCityItemClickListener;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 74
    .line 75
    invoke-static {v0}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->access$300(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityParseHelper;->getProvinceBean()Lcom/lljjcoder/bean/ProvinceBean;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 84
    .line 85
    invoke-static {v1}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->access$300(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityParseHelper;->getCityBean()Lcom/lljjcoder/bean/CityBean;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    new-instance v2, Lcom/lljjcoder/bean/DistrictBean;

    .line 94
    .line 95
    invoke-direct {v2}, Lcom/lljjcoder/bean/DistrictBean;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0, v1, v2}, Lcom/lljjcoder/Interface/OnCityItemClickListener;->onSelected(Lcom/lljjcoder/bean/ProvinceBean;Lcom/lljjcoder/bean/CityBean;Lcom/lljjcoder/bean/DistrictBean;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 103
    .line 104
    invoke-static {p1}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->access$200(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/Interface/OnCityItemClickListener;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 109
    .line 110
    invoke-static {v0}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->access$300(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityParseHelper;->getProvinceBean()Lcom/lljjcoder/bean/ProvinceBean;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 119
    .line 120
    invoke-static {v1}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->access$300(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityParseHelper;->getCityBean()Lcom/lljjcoder/bean/CityBean;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    iget-object v2, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 129
    .line 130
    invoke-static {v2}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->access$300(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, Lcom/lljjcoder/citywheel/CityParseHelper;->getDistrictBean()Lcom/lljjcoder/bean/DistrictBean;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {p1, v0, v1, v2}, Lcom/lljjcoder/Interface/OnCityItemClickListener;->onSelected(Lcom/lljjcoder/bean/ProvinceBean;Lcom/lljjcoder/bean/CityBean;Lcom/lljjcoder/bean/DistrictBean;)V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_2
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 143
    .line 144
    invoke-static {p1}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->access$200(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/Interface/OnCityItemClickListener;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    new-instance v0, Lcom/lljjcoder/bean/ProvinceBean;

    .line 149
    .line 150
    invoke-direct {v0}, Lcom/lljjcoder/bean/ProvinceBean;-><init>()V

    .line 151
    .line 152
    .line 153
    new-instance v1, Lcom/lljjcoder/bean/CityBean;

    .line 154
    .line 155
    invoke-direct {v1}, Lcom/lljjcoder/bean/CityBean;-><init>()V

    .line 156
    .line 157
    .line 158
    new-instance v2, Lcom/lljjcoder/bean/DistrictBean;

    .line 159
    .line 160
    invoke-direct {v2}, Lcom/lljjcoder/bean/DistrictBean;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, v0, v1, v2}, Lcom/lljjcoder/Interface/OnCityItemClickListener;->onSelected(Lcom/lljjcoder/bean/ProvinceBean;Lcom/lljjcoder/bean/CityBean;Lcom/lljjcoder/bean/DistrictBean;)V

    .line 164
    .line 165
    .line 166
    :goto_0
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;->this$0:Lcom/lljjcoder/style/citypickerview/CityPickerView;

    .line 167
    .line 168
    invoke-virtual {p1}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->hide()V

    .line 169
    .line 170
    .line 171
    return-void
.end method
