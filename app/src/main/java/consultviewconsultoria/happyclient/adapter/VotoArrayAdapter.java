package consultviewconsultoria.happyclient.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import consultviewconsultoria.happyclient.R;
import consultviewconsultoria.happyclient.object.Voto;

/**
 * Created by janiel on 10/12/2018.
 */

public class VotoArrayAdapter extends ArrayAdapter<Voto> {
    private int resource = 0;
    private LayoutInflater inflater;
    private Context context;

    public VotoArrayAdapter(Context context, int resource) {
        super(context, resource);
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.resource = resource;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        ViewHolder viewHolder = null;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            view = inflater.inflate(resource, parent, false);

            viewHolder.textViewExcelentei  =  view.findViewById( R.id.textExcelentei);
            viewHolder.textViewBomi         =  view.findViewById(R.id.textBomi);
            viewHolder.textViewRegulari         =  view.findViewById(R.id.textRegulari);
            viewHolder.textViewRuimi         =  view.findViewById(R.id.textRuimi);
            viewHolder.textViewPessimoi         =  view.findViewById(R.id.textPessimoi);

                        view.setTag(viewHolder);
                        convertView = view;
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            view = convertView;
        }

        Voto v = getItem(position);


        viewHolder.textViewExcelentei.setText(v.getExelente());
        viewHolder.textViewBomi.setText(v.getBom());
        viewHolder.textViewRegulari.setText(v.getRegular());
        viewHolder.textViewRuimi.setText(v.getRuim());
        viewHolder.textViewPessimoi.setText(v.getPessimo());
        return view;
    }

    static class ViewHolder {

        TextView textViewExcelentei;
        TextView textViewBomi;
        TextView textViewRegulari;
        TextView textViewRuimi;
        TextView textViewPessimoi;
    }
}