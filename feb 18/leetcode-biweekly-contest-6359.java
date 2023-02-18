String n=String.valueOf(num);
        String t="";
        int temp=0;
        int h=0;int l=Integer.MAX_VALUE;
        for(int i=0;i<n.length();i++){
            t=n.replace(n.charAt(i),'0');
            temp=Integer.valueOf(t);
            if(temp<l){
                l=temp;
            }
            t=n.replace(n.charAt(i),'9');
            temp=Integer.valueOf(t);
            if(temp>h){
                h=temp;
            }
        }
        int s=h-l;
        return s;
